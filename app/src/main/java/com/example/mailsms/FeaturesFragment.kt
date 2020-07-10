package com.example.mailsms

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mailsms.databinding.FragmentFeaturesBinding
import com.example.mailsms.FeaturesEnabled

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
/**
 * A simple [Fragment] subclass.
 * Use the [FeaturesFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class FeaturesFragment : Fragment() {
    private var _binding: FragmentFeaturesBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val data: FeaturesEnabled? = FeaturesEnabled(false, "Current Settings")
        _binding =
            FragmentFeaturesBinding.inflate(inflater, container, false)
        binding.invalidateAll()
        binding.featuresEnabled = data;
        val view = binding.root;
        return view
    }
}
