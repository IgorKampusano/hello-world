$(document).ready(function() {
    // функция выбора раздела меню
    function selectTypeBlock() {
        $('.types-block-small').append(`
                <div class="click-text">Кованые ворота станут не только средством защиты Вашей территории, а также ее отличным украшением. Большое разнообразие рисунков и уникальных декоративных кованых элементов для оформления откатных ворот позволяет</div>
        `);

        $('.types-image').remove();
        $('.types-block-small').append('<div class="types-image">Заказать</div>');
        // $('types-block-small').append(`
        //         <div class="click-text">Наиболее популярным вариантом заполнения является обшивка листами профнастила. Откатные ворота из профнастила имеют небольшой вес. Это экономически выгодное решения, которое возможно исполнить в короткие сроки.</div>
        //         <button class="click-button">Заказать</button>
        // `);
        // $('types-block-small').append(`
        //         <div class="click-text">Красивые и качественные ворота станут не только средством защиты Вашей территории, а также ее отличным украшением. Большое разнообразие рисунков и уникальных декоративных кованых элементов для оформления откатных ворот позволяет не ограничивать фантазию.</div>
        //         <button class="click-button">Заказать</button>
        // `);
        // $('types-block-small').append(`
        //         <div class="click-text">Красивые и качественные ворота станут не только средством защиты Вашей территории, а также ее отличным украшением. Большое разнообразие рисунков и уникальных декоративных кованых элементов для оформления откатных ворот позволяет не ограничивать фантазию.</div>
        //         <button class="click-button">Заказать</button>
        // `);
        // $('types-block-small').append(`
        //         <div class="click-text">Современный элемент приусадебного участка, который позволяет создать имитацию деревянных поверхностей. Сэндвич-панели придадут оригинальный внешний вид вашим воротам.</div>
        //         <button class="click-button">Заказать</button>
        // `);
        // $('types-block-small').append(`
        //         <div class="click-text">Красивые и качественные ворота станут не только средством защиты Вашей территории, а также ее отличным украшением. Большое разнообразие рисунков и уникальных декоративных кованых элементов для оформления откатных ворот позволяет не ограничивать фантазию.</div>
        //         <button class="click-button">Заказать</button>
        // `);




    }

    $('.types-block-small').on('mouseover', function() {
        selectTypeBlock();
    });

    $('.types-block-small').on('mouseout', function() {
        $('.click-text').remove();
        $('.types-image').remove();
        $('.types-block-small:nth-child(1)').append('<div class="types-image">Кованые</div>');
        $('.types-block-small:nth-child(2)').append('<div class="types-image">С обшивкой из профнастила</div>');
        $('.types-block-small:nth-child(3)').append('<div class="types-image">С обшивкой из дерева</div>');
        $('.types-block-small:nth-child(4)').append('<div class="types-image">С обшивкой из обрешетки</div>');
        $('.types-block-small:nth-child(5)').append('<div class="types-image">С обшивкой из сэндвич-панелей</div>');
        $('.types-block-small:nth-child(6)').append('<div class="types-image">С обшивкой из поликарбоната с коваными элементами</div>');


    })

    function selectMenuItem() {
        $('grey-bar container left-block').remove();
        $('grey-bar container right-block').remove();
        if ($('.choose-list li:nth-child(2)').isSelected()) {
            $('grey-bar container').append(` 
                    <form>
                        <input type="radio">Кованые</input> 
                        <input type="radio">Обшивка из профнастила</input>
                        <input type="radio">Обшивка из дерева</input> 
                        <input type="radio">Наполнение из сэндвич-панели</input>
                        <input type="radio">Обшивка из обрешетки</input> 
                        <input type="radio">Обшивка из стального листа с коваными элементами</input>
                        <input type="radio">Обшивка из поликарбоната с коваными элементами</input>
                    </form>
                `);
        }


        if ($('.choose-list li:nth-child(3)').isSelected()) {
            $('grey-bar container').append(`
            <form>
                <input type="radio">Да</input>
                <input type="radio">Нет</input>
            </form>
        `);
        }

        if ($('.choose-list li:nth-child(4)').isSelected()) {
            $('grey-bar container').append(`
            <form>
                <input type="radio">Автоматическое</input>
                <form>
                    <input type="radio">FAAC</input>
                    <input type="radio">Nice</input>
                    <input type="radio">CAME</input>
                </form>
                <input type="radio">Ручное</input>
            </form>
        `);
        }

        if ($('.choose-list li:nth-child(5)').isSelected()) {
            $('grey-bar container').append(`
            <form>
                <input type="radio">Монтаж ворот</input>
                <input type="radio">Выемка грунта + бетонирование основания</input>
                <input type="radio">Бетонирование отдельно стоящих столбов</input>
            </form>
        `);
        }

        $('.choose-list li').on('click', function() {
            selectMenuItem();
        });

    }
});