package SEARCH

import ENUM.SearchStatus

object SEARCH {
    fun search (keyword: String?, items: List<String>): SearchStatus {
        if (keyword.isNullOrBlank()) {
            return SearchStatus.EMPTY_KEYWORD
        }
        val result = items.filter {
            it.contains(keyword, ignoreCase = true)
        }
        if (result.isNullOrEmpty()) {
            return SearchStatus.SEARCH_SUCCESS
        }
        return SearchStatus.SEARCH_NO_RESULTS
    }
}