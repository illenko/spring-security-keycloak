package com.illenko.resource.dto

import java.util.UUID

data class Document(val id: UUID, val title: String, val text: String, val owner: String)