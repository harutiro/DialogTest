package app.makino.harutiro.dialogtest

import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.DialogFragment

class MainActivity() : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        showDialog(findViewById(R.id.cons))

    }

    fun showDialog(view: View?) {
        val dialogFragment: DialogFragment = MyDialogFragment()
        dialogFragment.show(supportFragmentManager, "my_dialog")
    }
}