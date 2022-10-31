package mobile_computing.main_package




import android.widget.TextView




class Welcome_Thread(private var Transport_Welcome_Textview: TextView) : Thread()
{
    private var i:            Int   = 0
    private var Rotation:     Float = 0f
    private var Text_Groesse: Float = 0f



    override fun run()
    {
        while (i > -361f)
        {
            Transport_Welcome_Textview.setRotation(Rotation)
            Transport_Welcome_Textview.setTextSize(Text_Groesse)


            Text_Groesse += 14f


            i--

            Rotation = i.toFloat()



            sleep(100)
        }
    }
}