@birdenfazlaexample @amazon
Feature: Amazonda urun arama
  Scenario Outline: TC07_kullanici amazonda dropdown ve aramakutusu kullanarak arama yapar
    Given kullanici "https://amazon.com" adresine gider
    And kullanici dropdownda "<kategori>" secer
    And kullanici arama kutusuna "<urunismi>" yazar ve arar
    Then kullanici sonuc sayisini ekrana yazdirir

    Examples: Test Verileri
    |kategori   |urunismi    |
    |Automotive |phone holder|
    |Baby       |stroller    |
    |Books      |Miserables  |