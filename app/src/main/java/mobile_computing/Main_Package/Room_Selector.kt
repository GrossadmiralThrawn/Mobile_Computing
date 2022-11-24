package mobile_computing.Main_Package

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView



class Room_Selector : AppCompatActivity()
{
    var Room: String                  = "G/-1/19"



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_room_selector)


        val Select_Room_TextView:      TextView = findViewById(R.id.editText_Room_Name)
        var Way_Descriptor_Activity                        = Intent(this, Way_Descriptor::class.java)
        var EditText_Room_Name_Input:  EditText = findViewById<EditText>(R.id.editText_Room_Name)
        var TextView_Fehlerbehandlung: TextView = findViewById(R.id.textView_False_Input)
        var Test_Array                          = arrayOf("TaC", "G/-1/19", "G/-1/20", "G/-1/21")


        Room = EditText_Room_Name_Input.text.toString()
        TextView_Fehlerbehandlung.visibility = View.INVISIBLE


        Room = "G/-1/19"



        if (Room != "" || Room != null)
        {
            for (element in Test_Array)
            {
                if (Room == element)
                {
                    Way_Descriptor_Activity.putExtra("Room_Name", Room)


                    startActivity(Way_Descriptor_Activity)
                }
                else
                {
                    continue
                }
            }
        }
        else
        {
            TextView_Fehlerbehandlung.visibility = View.VISIBLE
        }
    }
}