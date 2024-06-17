package sumago.androidipt.recyclerviewdemo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class StudentListAdapter extends RecyclerView.Adapter<StudentListAdapter.ViewHolder> {

    ArrayList<Student> list;

    public StudentListAdapter(ArrayList<Student> list){
        this.list = list;
    }

    @NonNull
    @Override
    public StudentListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //to specify the list item layout
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.student_list_item, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull StudentListAdapter.ViewHolder holder, int position) {
        //to implement the logic on the item components/widgets
        holder.imageView.setImageResource(list.get(position).getImageId());
        holder.tvName.setText(list.get(position).getName());
        holder.tvEmail.setText(list.get(position).getEmail()+"\n"+list.get(position).getGrade());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        //declaration
        ImageView imageView;
        TextView tvEmail, tvName;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            //initialization
            imageView = itemView.findViewById(R.id.imageView);
            tvEmail = itemView.findViewById(R.id.tvEmail);
            tvName = itemView.findViewById(R.id.tvName);
        }
    }
}