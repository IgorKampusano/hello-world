$(function() {

    $.get(
        'http://data.fixer.io/api/latest', { 'access_key': 'dbf56baee7de6684f390875078e31ce6' },
        function(response) {
            let textDollar = response.rates.USD;
            let textRubDollar = response.rates.RUB / textDollar;
            textRubDollar = (Math.floor(textRubDollar * 100)) / 100;
            $('.dollar').append(`
                <span class="dollar-text">${textRubDollar}</span>
                `);
            let textRubEuro = response.rates.RUB;
            textRubEuro = (Math.floor(textRubEuro * 100)) / 100;
            $('.euro').append(`
            <span class="euro-text">${textRubEuro}</span>
            `);
        }
    );



});