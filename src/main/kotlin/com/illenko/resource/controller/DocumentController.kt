package com.illenko.resource.controller

import com.illenko.resource.service.DocumentService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class DocumentController(private val documentService: DocumentService) {

    @GetMapping("/documents")
    fun documentsByUser() = documentService.getDocumentsByUser()
}