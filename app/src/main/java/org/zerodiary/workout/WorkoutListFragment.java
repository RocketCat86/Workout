package org.zerodiary.workout;

import android.app.Activity;
import android.os.Bundle;
import android.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;


/**
 * A fragment representing a list of Items.
 * <p>
 * <p>
 * Activities containing this fragment MUST implement the {@link OnFragmentInteractionListener}
 * interface.
 */
public class WorkoutListFragment extends ListFragment {

    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState){

        String[] names = new String[Workout.workOuts.length];
        for(int i = 0;i<names.length;i++){
            names[i] = Workout.workOuts[i].getName();
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<>(getView().getContext(),android.R.layout.simple_list_item_1,names);
        setListAdapter(adapter);

        return super.onCreateView(inflater,container,savedInstanceState);
    }


}
