package com.raywenderlich.android.imet

import com.raywenderlich.android.imet.data.PeopleRepository
import com.raywenderlich.android.imet.ui.add.AddPeopleViewModel
import com.raywenderlich.android.imet.ui.details.PeopleDetailsViewModel
import com.raywenderlich.android.imet.ui.list.PeoplesListAdapter
import com.raywenderlich.android.imet.ui.list.PeoplesListViewModel
import org.koin.android.viewmodel.ext.koin.viewModel
import org.koin.dsl.module.module

val appModule = module {

    single { PeopleRepository(get()) }
    single { PeoplesListAdapter() }

    viewModel { PeoplesListViewModel(get()) }
    viewModel { PeopleDetailsViewModel(get()) }
    viewModel { AddPeopleViewModel(get()) }
}