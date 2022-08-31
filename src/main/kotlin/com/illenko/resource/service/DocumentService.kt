package com.illenko.resource.service

import com.illenko.resource.dto.Document
import org.springframework.security.access.prepost.PostFilter
import org.springframework.stereotype.Service
import java.util.*

@Service
class DocumentService {

    @PostFilter("filterObject.owner == authentication.token.claims['user_name']")
    fun getDocumentsByUser() = mutableListOf(
        Document(UUID.randomUUID(), "Document for test-user-1", "Text for test-user-1", "test-user-1"),
        Document(UUID.randomUUID(), "Document for test-user-2", "Text for test-user-2", "test-user-2"),
        Document(UUID.randomUUID(), "Document for test-user-2 #2", "Text for test-user-2 #2", "test-user-2"),
        Document(UUID.randomUUID(), "Document for test-admin", "Text for test-admin", "test-admin"),
    )
}