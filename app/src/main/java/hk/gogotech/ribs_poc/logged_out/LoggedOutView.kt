package hk.gogotech.ribs_poc.logged_out

import android.content.Context
import android.util.AttributeSet
import android.util.Pair
import android.widget.LinearLayout

import com.jakewharton.rxbinding2.view.RxView

import io.reactivex.Observable
import kotlinx.android.synthetic.main.logged_out_rib.view.*

class LoggedOutView @JvmOverloads constructor(context: Context, attrs: AttributeSet? = null, defStyle: Int = 0) : LinearLayout(context, attrs, defStyle), LoggedOutInteractor.LoggedOutPresenter {
    override fun loginName(): Observable<Pair<String, String>> {
        return RxView.clicks(login_button).map { Pair.create(player_name_1.text.toString(), player_name_2.text.toString()) }
    }
}
