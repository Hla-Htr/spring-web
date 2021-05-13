$(document).ready(function ()
{
    getLoaiGiayAll();
});
function getLoaiGiayAll()
{
    $.ajax({
        type: 'POST',
        datatype: 'JSON',
        url: '/loaigiay/getall',
        success: function (result)
        {
            console.log(result);
            let html ="";
            for (let i =0;i < result.length;i++)
            {
                let infor = result[i];
                html += '<option value="'+infor.MaLoaiGiay+'">'+infor.TenLoaiGiay+'</option>';
            }
            $('#maloaigiay').empty().append(html);
        }
    })
}