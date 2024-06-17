package sumago.androidipt.recyclerviewdemo;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Student> students;
    RecyclerView recyclerView;
    StudentListAdapter adapter;
    RecyclerView.LayoutManager layoutManager;
    //declare
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //initialize
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        students = new ArrayList<Student>();

        Log.d("userIDs", "user = " + R.drawable.user);
        students.add(new Student(R.drawable.user, "Hari Korade", "hariprasadkorade@gmail.com", "A"));
        students.add(new Student(R.drawable.user2, "Iari Korade", "hariprasadkorad@gmail.com", "A"));
        students.add(new Student(R.drawable.user3, "Jari Korade", "hariprasadkore@gmail.com", "A"));
        students.add(new Student(R.drawable.user, "Kari Korade", "hariprasadade@gmail.com", "A"));
        students.add(new Student(R.drawable.user2, "Lari Korade", "hariprakorade@gmail.com", "A"));
        students.add(new Student(R.drawable.user3, "Mari Korade", "harsadkorade@gmail.com", "A"));
        students.add(new Student(R.drawable.user, "Nari Korade", "rasadkorade@gmail.com", "A"));
        students.add(new Student(R.drawable.user2, "Oari Korade", "asadkorade@gmail.com", "A"));

        adapter = new StudentListAdapter(students);
        recyclerView.setAdapter(adapter);

        layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);
        //logic
    }
}