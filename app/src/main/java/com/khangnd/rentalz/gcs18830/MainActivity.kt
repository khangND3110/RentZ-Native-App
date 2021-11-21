package com.khangnd.rentalz.gcs18830

import android.content.DialogInterface
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.khangnd.rentalz.gcs18830.databinding.ActivityMainBinding
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class MainActivity : AppCompatActivity() {
    private lateinit var mLayoutBinding: ActivityMainBinding

    // reporter name
    private var mIsReporterNameValid: Boolean? = null
    private val mReporterNameTextWatcher = object : TextWatcher {
        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
        override fun afterTextChanged(s: Editable?) {
            val homeName = s.toString().trim()
            mIsReporterNameValid = homeName.isNotEmpty()
            mLayoutBinding.reporterNameTextError.visibility = View.VISIBLE
            mLayoutBinding.reporterNameTextError.text =
                if (!mIsReporterNameValid!!) baseContext.getString(R.string.error_text) else ""
            enableButton()
        }
    }

    // home name
    private var mIsHomeNameValid: Boolean? = null
    private val mHomeNameTextWatcher = object : TextWatcher {
        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
        override fun afterTextChanged(s: Editable?) {
            val homeName = s.toString().trim()
            mIsHomeNameValid = homeName.isNotEmpty()
            mLayoutBinding.homeNameTextError.visibility = View.VISIBLE
            mLayoutBinding.homeNameTextError.text =
                if (!mIsHomeNameValid!!) baseContext.getString(R.string.error_text) else ""
            enableButton()
        }
    }

    // street
    private var mIsStreetValid: Boolean? = null
    private val mStreetTextWatcher = object : TextWatcher {
        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
        override fun afterTextChanged(s: Editable?) {
            val street = s.toString().trim()
            mIsStreetValid = street.isNotEmpty()
            mLayoutBinding.streetTextError.visibility = View.VISIBLE
            mLayoutBinding.streetTextError.text =
                if (!mIsStreetValid!!) baseContext.getString(R.string.error_text) else ""
            enableButton()
        }
    }

    // ward
    private var mIsWardValid: Boolean? = null
    private val mWardTextWatcher = object : TextWatcher {
        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
        override fun afterTextChanged(s: Editable?) {
            val ward = s.toString().trim()
            mIsWardValid = ward.isNotEmpty()
            mLayoutBinding.wardTextError.visibility = View.VISIBLE
            mLayoutBinding.wardTextError.text =
                if (!mIsWardValid!!) baseContext.getString(R.string.error_text) else ""
            enableButton()
        }
    }

    // district
    private var mIsDistrictValid: Boolean? = null
    private val mDistrictTextWatcher = object : TextWatcher {
        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
        override fun afterTextChanged(s: Editable?) {
            val ward = s.toString().trim()
            mIsDistrictValid = ward.isNotEmpty()
            mLayoutBinding.districtTextError.visibility = View.VISIBLE
            mLayoutBinding.districtTextError.text =
                if (!mIsDistrictValid!!) baseContext.getString(R.string.error_text) else ""
            enableButton()
        }
    }

    // city
    private var mIsCityValid: Boolean? = null
    private val mCityTextWatcher = object : TextWatcher {
        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
        override fun afterTextChanged(s: Editable?) {
            val ward = s.toString().trim()
            mIsCityValid = ward.isNotEmpty()
            mLayoutBinding.cityTitleError.visibility = View.VISIBLE
            mLayoutBinding.cityTitleError.text =
                if (!mIsCityValid!!) baseContext.getString(R.string.error_text) else ""
            enableButton()
        }
    }

    // furniture type
    private var mIsFurnitureTypeValid: Boolean? = null
    private val mFurnitureTypeTextWatcher = object : TextWatcher {
        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
        override fun afterTextChanged(s: Editable?) {
            val ward = s.toString().trim()
            mIsFurnitureTypeValid = ward.isNotEmpty()
            mLayoutBinding.tvFurnitureTypeError.visibility = View.VISIBLE
            mLayoutBinding.tvFurnitureTypeError.text =
                if (!mIsFurnitureTypeValid!!) baseContext.getString(R.string.error_text) else ""
            enableButton()
        }
    }

    // house type
    private var mIsHouseTypeValid: Boolean? = null
    private val mHouseTypeTextWatcher = object : TextWatcher {
        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
        override fun afterTextChanged(s: Editable?) {
            val ward = s.toString().trim()
            mIsHouseTypeValid = ward.isNotEmpty()
            mLayoutBinding.tvHouseTypeError.visibility = View.VISIBLE
            mLayoutBinding.tvHouseTypeError.text =
                if (!mIsHouseTypeValid!!) baseContext.getString(R.string.error_text) else ""
            enableButton()
        }
    }

    // number of room
    private var mIsNoRoomValid: Boolean? = null
    private val mNoRoomTextWatcher = object : TextWatcher {
        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
        override fun afterTextChanged(s: Editable?) {
            val ward = s.toString().trim()
            mIsNoRoomValid = ward.isNotEmpty()
            mLayoutBinding.noRoomTextError.visibility = View.VISIBLE
            mLayoutBinding.noRoomTextError.text =
                if (!mIsNoRoomValid!!) baseContext.getString(R.string.error_text) else ""
            enableButton()
        }
    }

    // price
    private var mIsPriceValid: Boolean? = null
    private val mPriceTextWatcher = object : TextWatcher {
        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
        override fun afterTextChanged(s: Editable?) {
            val ward = s.toString().trim()
            mIsPriceValid = ward.isNotEmpty()
            mLayoutBinding.priceTitleError.visibility = View.VISIBLE
            mLayoutBinding.priceTitleError.text =
                if (!mIsPriceValid!!) baseContext.getString(R.string.error_text) else ""
            enableButton()
        }
    }

    // notes
    private var mNotesValid: Boolean? = null
    private val mNotesTextWatcher = object : TextWatcher {
        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
        override fun afterTextChanged(s: Editable?) {
            val ward = s.toString().trim()
            mNotesValid = ward.isNotEmpty()
            mLayoutBinding.descriptionTextError.visibility = View.VISIBLE
            mLayoutBinding.descriptionTextError.text =
                if (!mNotesValid!!) baseContext.getString(R.string.error_text) else ""
            enableButton()
        }
    }
    // created_at

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mLayoutBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mLayoutBinding.root)
//        handleAnimation()
        setupTextWatcher()

        mLayoutBinding.loginButton.setOnClickListener {
            showCustomDialog()
        }
    }

    private fun enableButton() {
        mLayoutBinding.loginButton.isEnabled =
            mIsHomeNameValid ?: false
                    && mIsStreetValid ?: false
                    && mIsReporterNameValid ?: false
                    && mIsWardValid ?: false
                    && mIsDistrictValid ?: false
                    && mIsCityValid ?: false
                    && mIsFurnitureTypeValid ?: false
                    && mIsHouseTypeValid ?: false
                    && mIsNoRoomValid ?: false
                    && mIsPriceValid ?: false
    }

    private fun setupTextWatcher() {
        mLayoutBinding.reporterNameInput.addTextChangedListener(mReporterNameTextWatcher)
        mLayoutBinding.homeNameInput.addTextChangedListener(mHomeNameTextWatcher)
        mLayoutBinding.streetInput.addTextChangedListener(mStreetTextWatcher)
        mLayoutBinding.wardInput.addTextChangedListener(mWardTextWatcher)
        mLayoutBinding.districtInput.addTextChangedListener(mDistrictTextWatcher)
        mLayoutBinding.cityInput.addTextChangedListener(mCityTextWatcher)
        mLayoutBinding.furnitureTypeInput.addTextChangedListener(mFurnitureTypeTextWatcher)
        mLayoutBinding.houseTypeInput.addTextChangedListener(mHouseTypeTextWatcher)
        mLayoutBinding.noRoomInput.addTextChangedListener(mNoRoomTextWatcher)
        mLayoutBinding.priceInput.addTextChangedListener(mPriceTextWatcher)
//        mLayoutBinding.etDescription.addTextChangedListener(mPasswordTextWatcher)
    }

    private fun showCustomDialog() {
        val builder1: AlertDialog.Builder = AlertDialog.Builder(this)

        val current = LocalDateTime.now()
        val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS")
        val formatted = current.format(formatter)

        builder1.setMessage("Reporter name: ${mLayoutBinding.reporterNameInput.text.toString()} " +
                "\nHome name: ${mLayoutBinding.homeNameInput.text.toString()} " +
                "\nAddress: ${mLayoutBinding.streetInput.text.toString()}, " +
                "${mLayoutBinding.wardInput.text.toString()}, " +
                "${mLayoutBinding.districtInput.text.toString()}, " +
                "${mLayoutBinding.cityInput.text.toString()} " +
                "\nFurniture type: ${mLayoutBinding.furnitureTypeInput.text.toString()}" +
                "\nHouse type: ${mLayoutBinding.houseTypeInput.text.toString()}" +
                "\nNumber of rooms: ${mLayoutBinding.noRoomInput.text.toString()}" +
                "\nRent price: ${mLayoutBinding.priceInput.text.toString()}" +
                "\nNotes: ${mLayoutBinding.descriptionInput.text.toString()}" +
                "\nCreated at:  $formatted")
        builder1.setCancelable(true)

        builder1.setPositiveButton(
            "Yes",
            DialogInterface.OnClickListener { dialog, id -> dialog.cancel() })

        builder1.setNegativeButton(
            "No",
            DialogInterface.OnClickListener { dialog, id -> dialog.cancel() })

        val alert11: AlertDialog = builder1.create()
        alert11.show()
    }
}