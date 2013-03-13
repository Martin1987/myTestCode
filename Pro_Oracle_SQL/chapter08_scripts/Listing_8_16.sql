PROMPT 
PROMPT percentile_cont
PROMPT
  col product format A30
  col country format A10
  col region format A10
  col year format 9999
  col week format 99
  col sale format 999999.99
  col receipts format 999999.99
  set lines 120 pages 100
select  year, week,sale,
   percentile_cont (0.5)  within group (order by sale desc)
	  over( partition by product, country, region , year ) pc,
   percent_rank () over (
          partition by product, country, region , year 
          order by sale desc ) pr
  from sales_fact
  where country in ('Australia')  and product ='Xtend Memory'
/
