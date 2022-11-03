package mobile_computing.Main_Package

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Room_Selector : AppCompatActivity()
{
    var Room: String = "Funktioniert"



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_room_selector)


        val Test_2_TextView:          TextView = findViewById(R.id.Descriptor_TextView)
        var New_Activity                      = Intent(this, Way_Descriptor::class.java)



        New_Activity.putExtra("Room_Name", Room)


        startActivity(New_Activity)
    }
}