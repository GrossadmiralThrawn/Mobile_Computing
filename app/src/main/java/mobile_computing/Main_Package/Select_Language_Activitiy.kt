package mobile_computing.Main_Package




import android.content.SharedPreferences
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity




class Select_Language_Activitiy : AppCompatActivity()
{
    lateinit var Deutsch_Checkbox:        CheckBox
    lateinit var English_Checkbox:        CheckBox
    lateinit var Franzoesisch_Checkbox:   CheckBox
    lateinit var Select_Language_Button:  Button





    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select_language_activitiy)



        Deutsch_Checkbox      = findViewById(R.id.checkBox_Deutsch)
        English_Checkbox      = findViewById(R.id.checkBox_Englisch)
        Franzoesisch_Checkbox = findViewById(R.id.checkBox_Franzoesisch)


        Select_Language_Button = findViewById(R.id.Select_Language_Button)
        Select_Language_Button.setOnClickListener(View.OnClickListener()
        {
            val Language_Key:             String                   = "Language Key"
            val Primary_Settings                                           = getSharedPreferences("My_Primary_Preferences", 0)
            val Edit_Language:                    SharedPreferences.Editor = Primary_Settings.edit()
            val To_Many_Arguments: TextView = findViewById(R.id.textView_To_Many_Arguments)



            if (Deutsch_Checkbox.isChecked &&(English_Checkbox.isChecked || Franzoesisch_Checkbox.isChecked))
            {
                To_Many_Arguments.visibility = View.VISIBLE
            }
            else
            {
                if ((English_Checkbox.isChecked && (Deutsch_Checkbox.isChecked || Franzoesisch_Checkbox.isChecked)) || (Franzoesisch_Checkbox.isChecked && (Deutsch_Checkbox.isChecked || English_Checkbox.isChecked)))
                {
                    To_Many_Arguments.visibility = View.VISIBLE
                }
                else
                {
                    if (Deutsch_Checkbox.isChecked)
                    {
                        Edit_Language.putString(Language_Key, "De")
                        Edit_Language.commit()
                    }
                    else
                    {
                        if (English_Checkbox.isChecked)
                        {
                            Edit_Language.putString(Language_Key, "En")
                            Edit_Language.commit()
                        }
                        else
                        {
                            if (Franzoesisch_Checkbox.isChecked)
                            {
                                Edit_Language.putString(Language_Key, "Fr")
                                Edit_Language.commit()
                            }
                            else
                            {
                                To_Many_Arguments.text = "Please select a language"
                            }
                        }
                    }
                }
            }
        })
    }

}