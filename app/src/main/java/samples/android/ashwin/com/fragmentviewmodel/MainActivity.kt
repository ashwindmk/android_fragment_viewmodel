package samples.android.ashwin.com.fragmentviewmodel

import android.arch.lifecycle.ViewModelProviders
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import samples.android.ashwin.com.fragmentviewmodel.ui.main.MainFragment
import samples.android.ashwin.com.fragmentviewmodel.ui.main.MainViewModel
import samples.android.ashwin.com.fragmentviewmodel.ui.main.NextFragment

class MainActivity : AppCompatActivity() {
    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        init()
        if (savedInstanceState == null) {
            back()
        }
    }

    fun init() {
        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
    }

    fun get(): MainViewModel {
        return viewModel
    }

    fun next() {
        supportFragmentManager.beginTransaction()
            .replace(R.id.container, NextFragment.newInstance())
            .commitNow()
    }

    fun back() {
        supportFragmentManager.beginTransaction()
            .replace(R.id.container, MainFragment.newInstance())
            .commitNow()
    }
}
