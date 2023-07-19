package sg.edu.rp.c346.id22022096.demotodolist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    ListView lvtask;
    ArrayList<ToDoItem> alToDoList;
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvtask = findViewById(R.id.lvtask);

        alToDoList = new ArrayList<>();
        Calendar date1 = Calendar.getInstance();
        date1.set(2020, 8, 1);
        Calendar date2 = Calendar.getInstance();
        date2.set(2020, 8, 2);
        ToDoItem item1 = new ToDoItem("go for movie", date1);
        ToDoItem item2 = new ToDoItem("go for haircut", date2);
        alToDoList.add(item1);
        alToDoList.add(item2);

        adapter= new CustomAdapter(this, R.layout.todolist, alToDoList);

        lvtask.setAdapter(adapter);

    }
}