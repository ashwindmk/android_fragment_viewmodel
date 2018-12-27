package samples.android.ashwin.com.fragmentviewmodel.ui.main

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.next_fragment.*
import samples.android.ashwin.com.fragmentviewmodel.MainActivity
import samples.android.ashwin.com.fragmentviewmodel.R

/**
 * Created by Ashwin on 12/27/2018.
 */
class NextFragment : Fragment() {
    companion object {
        fun newInstance() = NextFragment()
    }

    private lateinit var viewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.next_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = (activity as MainActivity).get()
        textview.text = viewModel.text
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        back_button.setOnClickListener {
            (activity as MainActivity).back()
        }
    }
}
