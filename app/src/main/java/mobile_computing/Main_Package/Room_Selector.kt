package mobile_computing.Main_Package

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView



class Room_Selector : AppCompatActivity()
{
    var Gebaeude: String                  = ""
    var Room:     String                  = ""
    var Out_Of_While_Boolean: Boolean = false



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_room_selector)


        val Test_2_TextView:          TextView = findViewById(R.id.textView_Test_2)
        var New_Activity                       = Intent(this, Way_Descriptor::class.java)
        var EditText_Room_Name_Input: EditText = findViewById(R.id.editText_Room_Name)



        while (Out_Of_While_Boolean == false)
        {
            Gebaeude = EditText_Room_Name_Input.text.toString()

            if (Gebaeude != "" && Gebaeude != null )
            {

            }
        }



        New_Activity.putExtra("Room_Name", Room)


        startActivity(New_Activity)
    }
}