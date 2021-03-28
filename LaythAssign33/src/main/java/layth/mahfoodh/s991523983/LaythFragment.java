/*
Layth Mahfoodh s991523983 PROG38448
 */
package layth.mahfoodh.s991523983;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link LaythFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class LaythFragment extends Fragment {
    private CanvasView customCanvas;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private LaythActivity activity;

    public LaythFragment() {
        // Required empty public constructor
    }

    public static LaythFragment newInstance() {
        return new LaythFragment();
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment LaythFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static LaythFragment newInstance(String param1, String param2) {
        LaythFragment fragment = new LaythFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
         //   customCanvas = (CanvasView) findViewById(R.id.canvas);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_layth, container, false);
        customCanvas = (CanvasView) view.findViewById(R.id.canvas);

       Button lFragBtn = (Button) view.findViewById(R.id.button1);

// perform setOnClickListener event on First Button
        lFragBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
// load First Fragment
                customCanvas.cleanUp();
            }
        });

        final Spinner spin = (Spinner) view.findViewById(R.id.pen_thick);
        final Spinner spin1 = (Spinner) view.findViewById(R.id.pen_color);
        //create a button object
        final Button submit = (Button) view.findViewById(R.id.submit);
        //handle the  click event
        submit.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                //get the spinner view as text view
             //   TextView text_sel = (TextView)spin.getSelectedView();

                //get the text from the spinner view
              //  Toast.makeText(LaythFragment.this, "\n Province = "+text_sel.getText(), Toast.LENGTH_SHORT).show();

               if(spin.getSelectedItemPosition()==1){
                     //  getAdapter().getCount() == 4){
                   customCanvas.upDateThick1();
               }
               else  if(spin.getSelectedItemPosition()==2){
                   //  getAdapter().getCount() == 4){
                   customCanvas.upDateThick2();
               }
               else  {
                   //  getAdapter().getCount() == 4){
                   customCanvas.upDateThick3();
               }

                if(spin1.getSelectedItemPosition()==1){
                    //  getAdapter().getCount() == 4){
                    customCanvas.upDateColor1();
                }
                else  if(spin1.getSelectedItemPosition()==2){
                    //  getAdapter().getCount() == 4){
                    customCanvas.upDateColor2();
                }
                else  {
                    //  getAdapter().getCount() == 4){
                    customCanvas.upDateColor3();
                }


/*
                final Spinner spin = (Spinner) view.findViewById(R.id.pen_color);
                //create a button object
            //    final Button submit = (Button) view.findViewById(R.id.submit);
                //handle the  click event
                submit.setOnClickListener(new View.OnClickListener() {

                    public void onClick(View v) {
                        //get the spinner view as text view
                        //   TextView text_sel = (TextView)spin.getSelectedView();

                        //get the text from the spinner view
                        //  Toast.makeText(LaythFragment.this, "\n Province = "+text_sel.getText(), Toast.LENGTH_SHORT).show();

                        if(spin.getSelectedItemPosition()==1){
                            //  getAdapter().getCount() == 4){
                            customCanvas.upDateColor1();
                        }
                        else  if(spin.getSelectedItemPosition()==2){
                            //  getAdapter().getCount() == 4){
                            customCanvas.upDateColor2();
                        }
                        else  {
                            //  getAdapter().getCount() == 4){
                            customCanvas.upDateColor3();
                        }
*/





               System.out.println("number is " +spin.getAdapter().getCount());
                System.out.println("number is* " +spin.getChildCount());
                System.out.println("number is* " +spin.getSelectedItemPosition());

            }

        });


        return view;

    }
/*
    public void clearCanvas(View view){
     customCanvas.cleanUp();
    }
    */

}