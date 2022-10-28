package mobile_computing.Main_Package

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox

class Select_Language_Activitiy : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select_language_activitiy)



        var Deutsch_Checkbox:      CheckBox = findViewById(R.id.checkBox_Deutsch)
        var English_Checkbox:      CheckBox = findViewById(R.id.checkBox_Englisch)
        var Franzoesisch_Checkbox: CheckBox = findViewById(R.id.checkBox_Franzoesisch)



    }
}