@teknolojikarama
Feature: Amazon Birden Fazla Arama
  Scenario Outline: TC05_kullanici amazonda urun arar
    Given kullanici amazon sayfasina gider
    And kullanici arama kutusuna "<urunler>" yazar ve arar
    Then kullanici sonuc sayisini ekrana yazdirir

    Examples: urun isimleri
    |urunler|
    |headphones|
    |camera    |
    |pencil    |
    |bcycle    |
    |laptop    |
    |mouse     |
    |bag       |