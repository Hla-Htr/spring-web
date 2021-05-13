$(document).ready(function () {
    getGiayAll()
});

function getGiayAll()
{
    $.ajax({
        type: 'POST',
        datatype: 'JSON',
        url: '/giay/getall',
        success: function (result)
        {
            console.log(result);
            let html ="";
            for (let i =0;i < result.length;i++)
            {
                let infor = result[i];
                html += '<tr>'
                    +'<td>'+ +'</td>'+
                    '</tr>';
            }
            $('#banggiay tbody').empty().append(html);
        }
    })
}