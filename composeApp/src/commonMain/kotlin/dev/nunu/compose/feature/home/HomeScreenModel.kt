package dev.nunu.compose.feature.home

import cafe.adriel.voyager.core.model.StateScreenModel

class HomeScreenModel : StateScreenModel<HomeScreenModel.State>(State.Loading) {
    sealed interface State {
        data object Loading : State
        data class Content(val tasks: List<String>) : State
    }

}
