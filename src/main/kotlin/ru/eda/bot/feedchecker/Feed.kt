package ru.eda.bot.feedchecker

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement
import javax.validation.Valid
import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotEmpty
import javax.validation.constraints.NotNull

@JacksonXmlRootElement(localName = "yml_catalog")
data class Feed(

    @field:Valid
    @field:NotNull
    @JacksonXmlProperty(localName = "shop")
    val shop: Shop?
)

data class Shop(

    @JacksonXmlProperty(localName = "name")
    val name: String?,

    @JacksonXmlProperty(localName = "company")
    val company: String?,

    @JacksonXmlProperty(localName = "url")
    val url: String?,

    @field:Valid
    @JacksonXmlProperty(localName = "currencies")
    val currencies: List<Currency>?,

    @field:Valid
    @JacksonXmlProperty(localName = "categories")
    val categories: List<Category>?,

    @field:Valid
    @JacksonXmlProperty(localName = "offers")
    val offers: List<Offer>?
)

class Currency
class Category

data class Offer(

    @field:NotBlank
    @JacksonXmlProperty(localName = "id", isAttribute = true)
    val id: String?,

    @field:NotEmpty
    @JacksonXmlProperty(localName = "url")
    val url: String?,

    @field:NotEmpty
    @JacksonXmlProperty(localName = "categoryId")
    val categoryId: String?,

    @JacksonXmlProperty(localName = "name")
    val name: String?,

    @JacksonXmlProperty(localName = "model")
    val model: String?,

    @JacksonXmlProperty(localName = "typePrefix")
    val typePrefix: String?,

    @JacksonXmlProperty(localName = "vendor")
    val vendor: String?,

    @JacksonXmlProperty(localName = "title")
    val title: String?
)
