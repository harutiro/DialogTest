package app.makino.harutiro.dialogtest

import android.content.DialogInterface
import android.os.Bundle
import androidx.fragment.app.DialogFragment
import android.app.AlertDialog
import android.app.Dialog
import androidx.annotation.Nullable



class MyDialogFragment : DialogFragment(){
    override fun onCreateDialog(@Nullable savedInstanceState: Bundle?): Dialog {
        val builder: AlertDialog.Builder = AlertDialog.Builder(activity)
        builder.setTitle("タイトル")
            .setMessage("ここにメッセージを入力します")
            .setPositiveButton("OK", DialogInterface.OnClickListener { dialog, id ->
                // このボタンを押した時の処理を書きます。
            })
            .setNegativeButton("キャンセル", null)
            .setNeutralButton("あとで", null)
        return builder.create()
    }
}