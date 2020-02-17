import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class Constant {
    // Страница авторизации
    static final String VALID_USER_LOGIN = "vasya";
    static final String VALID_USER_PASSWORD = "qwerty123";
    static final SelenideElement AUTH_PAGE_TITLE = $("h2.heading ");  //  заголовок страницы
    static final SelenideElement AUTH_LOGIN_INPUT = $("[name=login]");  //  поле ввода логина
    static final SelenideElement AUTH_PASSWORD_INPUT = $("[name=password]");  //  поле ввода пароля
    static final SelenideElement AUTH_CONTINUE_BUTTON = $("[data-test-id=action-login]");  //  кнопка "Продолжить"

    //  Страница вериикации смс

    static final String VALID_SMS_NOTIFY = "12345";
    static final SelenideElement SMS_ACCEPT_INPUT = $(".input__control");  //  поле ввода кода смс
    static final SelenideElement SMS_ACCEPT_BUTTON = $("[data-test-id='action-verify']");  //  кнопка продолжить

    //  Стрваница со счетами карт

    static final SelenideElement BALANCE_DASHBOARD = $("[data-test-id=dashboard]");  //  форма с балансами
    static final SelenideElement BALANCE_TRANSFER_BUTTON_0001 = $("div > ul > li:nth-child(1) > div > button");  //  кнопка "пополнить" карту **** 0001
    static final SelenideElement BALANCE_TRANSFER_BUTTON_0002 = $("div > ul > li:nth-child(2) > div > button");  //  кнопка "пополнить" карту **** 0002

    //  Страница перевода денег с карты на карту

    static final SelenideElement CARD_REPLENISHMENT_TITLE = $(byText("Пополнение карты"));  //  Заголовок страницы пополнения карты
    static final SelenideElement CARD_REPLENISHMENT_INPUT_SUM = $(".money-input .input__control");  //  Поле ввода суммы пополнения
    static final SelenideElement CARD_REPLENISHMENT_FROM = $("[type=tel]");  //  поле ввода номера карты ОТКУДА снимается
    static final SelenideElement CARD_BUTTON_TRANSFER = $("[data-test-id=\"action-transfer\"]");  //  кнопка "Пополнить"

    static final String CARD_NUMBER_0001 = "5559 0000 0000 0001";  //  номер счета 0001
    static final String CARD_NUMBER_0002 = "5559 0000 0000 0002";  //  номер счета 0002
}