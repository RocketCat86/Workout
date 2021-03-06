package org.zerodiary.workout;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class WorkoutDetailFragment extends Fragment {

    private long workoutid;



    public WorkoutDetailFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if(savedInstanceState != null){
            workoutid = savedInstanceState.getLong("workoutId");
        }
        return inflater.inflate(R.layout.fragment_workout_detail, container, false);
    }


    @Override
    public void onStart(){
        super.onStart();
        View view = getView();
        if(view != null){
            Workout workout = Workout.workOuts[(int)workoutid];
            TextView title = (TextView)view.findViewById(R.id.textTitle);
            title.setText(workout.getName());
            TextView description = (TextView)view.findViewById(R.id.description);
            description.setText(workout.getDescription());
        }
    }

    @Override
    public void onSaveInstanceState(Bundle instance){
        super.onSaveInstanceState(instance);
        instance.putLong("workoutId",workoutid);
    }

    public void setWorkout(long id){
        this.workoutid = id;
    }

}
