insert into orders
  (2459, sysdate, 'direct', 1, 141, 145) ;

select current_scn from v$database ;


update orders
   set order_total = 7208
 where order_id = 2459; 

       customer, 
       mobile, 
       status,
       order_total,
       order_date
  from order_detail_header

select line_item_id, 
       product_name,
       unit_price,
       discount_price,
       quantity,
       line_item_total 
  from order_detail_line_items
 where order_id = 2459

select current_scn from v$database ;


select current_scn from v$database ;