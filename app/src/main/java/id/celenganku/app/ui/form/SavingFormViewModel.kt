package id.celenganku.app.ui.form

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import id.celenganku.app.db.SavingDao
import id.celenganku.app.model.SavingsEntity
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class SavingFormViewModel(private val savingDao: SavingDao) : ViewModel() {

    fun addSaving(savings: SavingsEntity) = viewModelScope.launch(Dispatchers.IO){
        try {
            savingDao.addSaving(savings)
        }catch (e: Exception){

        }
    }
}