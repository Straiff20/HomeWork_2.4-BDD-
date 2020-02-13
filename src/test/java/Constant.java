import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class Constant {
    // Страница авторизации
    static final String valid_user_login = "vasya";
    static final String valid_user_password = "qwerty123";
    static final SelenideElement AUTH_PAGE_TITLE = $("h2.heading ");  //  заголовок страницы
    static final SelenideElement AUTH_LOGIN_INPUT = $("[name=login]");  //  поле ввода логина
    static final SelenideElement AUTH_PASSWORD_INPUT = $("[name=password]");  //  поле ввода пароля
    static final SelenideElement AUTH_CONTINUE_BUTTON = $("[data-test-id=action-login]");  //  кнопка "Продолжить"

    //  Страница вериикации смс

    static final String valid_sms_notify = "12345";
    static final SelenideElement sms_accept_input = $(".input__control");  //  поле ввода кода смс
    static final SelenideElement sms_accept_button = $("[data-test-id='action-verify']");  //  кнопка пролжить

    //  Стрваница со счетами карт

    static final SelenideElement balance_dashboard = $("[data-test-id=dashboard]");  //  форма с балансами
    static final SelenideElement balance_transfer_button_0001 = $("div > ul > li:nth-child(1) > div > button");  //  кнопка "пополнить" карту **** 0001
    static final SelenideElement balance_transfer_button_0002 = $("div > ul > li:nth-child(2) > div > button");  //  кнопка "пополнить" карту **** 0002

    //  Страница перевода денег с карты на карту

    static final SelenideElement card_replenishment_title = $(byText("Пополнение карты"));  //  Заголовок страницы пополнения карты
    static final SelenideElement card_replenishment_input_sum = $(".money-input .input__control");  //  Поле ввода суммы пополнения
    static final SelenideElement card_replenishment_from = $("[type=tel]");  //  поле ввода номера карты ОТКУДА снимается
    static final SelenideElement card_button_transfer = $("[data-test-id=\"action-transfer\"]");  //  кнопка "Пополнить"
    static final SelenideElement card_button_cancel = $("[data-test-id=\"action-cancel\"]");  //  кнопка отмены

    static final String card_number_0001 = "5559 0000 0000 0001";  //  номер счета 0001
    static final String card_number_0002 = "5559 0000 0000 0002";  //  номер счета 0002
}