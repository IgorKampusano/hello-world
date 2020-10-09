$(document).ready(function() {

    // функция добавления дела
    function dealAdd() {

        let name = $('input').val(),
            text = $('textarea').val();

        if (name.length !== 0 && text.length !== 0) {

            $('.list_none').hide();

            $('.deals_list').append(`
            
                <li class="deal_item">
                    <div class="name_block">
                        <h3 class="deal_name">${name}</h3>
                        <button class="deal_delete"></button>
                        <button class="arrow"></button>
                    </div>
                    <hr>
                    <div class="deal_description">
                        ${text}
                    </div>
                </li>
            
            `);

            name = $('input').val('');
            text = $('textarea').val('');


        } else {
            $('input').addClass('error');
            $('textarea').addClass('error');
        }

    }

    // функция удаления дела
    function deleteDeal(item) {
        item.remove();

        let items = $('.deal_item');


        if (items.length == 0) {
            $('.list_none').show();
        }
    }

    $('.add_deal_button').on('click', dealAdd);

    // функция возвращения надписи "Список пуст:"
    $('body').on('click', '.deal_delete', function(event) {
        event.preventDefault();

        let item = $(this).parents('.deal_item');

        deleteDeal(item);

    });

    // функция сворачивания и разворачивания блока
    function transformBlock(descr) {
        descr.slideToggle();
    }

    $('body').on('click', '.arrow', function(event) {
        event.preventDefault();

        let descr = $(this).parents('.deal_item').find('.deal_description');

        // if (descr.is(':visible')) {
        //     $(this).css({
        //         'transform': 'rotate(90deg)',
        //         'background-position': 'center'
        //     })
        // } else {
        //     $(this).css({
        //         'transform': 'rotate(-360deg)',
        //         'background-position': 'center'
        //     })
        // }

        $('.arrow').toggleClass('.turn_arrow');

        transformBlock(descr);




    });
});