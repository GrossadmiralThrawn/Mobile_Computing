package mobile_computing.Main_Package

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView



class Room_Selector : AppCompatActivity()
{
    var Room: String                  = ""
    var Out_Of_While_Boolean: Boolean = false



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_room_selector)


        val Select_Room_TextView:      TextView = findViewById(R.id.textView_Select_Room)
        var New_Activity                        = Intent(this, Way_Descriptor::class.java)
        var EditText_Room_Name_Input:  EditText = findViewById(R.id.editText_Room_Name)
        var TextView_Fehlerbehandlung: TextView = findViewById(R.id.textView_False_Input)


        Room = EditText_Room_Name_Input.text.toString()
        TextView_Fehlerbehandlung.visibility = View.INVISIBLE



        if (Room != "" || Room != null)
        {
            TextView_Fehlerbehandlung.visibility = View.VISIBLE
        }




        New_Activity.putExtra("Room_Name", Room)


        startActivity(New_Activity)
    }
}