package com.example.collpage.ui

import androidx.lifecycle.ViewModel
import com.example.collpage.R
import com.example.collpage.data.OnboardingData

class WelcomeViewModel : ViewModel() {
    val onboardingItems = listOf(
        OnboardingData(
            R.drawable.collaboration,
            "Kolaborasi",
            "Buat ruang untuk kolaborasi",
            false
        ),
        OnboardingData(
            R.drawable.connection,
            "Koneksi",
            "Bangun Relasi Antar Mahasiswa",
            false
        ),
        OnboardingData(
            R.drawable.communication,
            "Komunikasi",
            "Diskusikan pekerjaan bersama kolegamu!",
            true
        )
    )
}