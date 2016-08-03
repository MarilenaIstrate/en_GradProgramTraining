Select * from facturi.detaliu_factura;
Select * from facturi.produs;
Select * from facturi.factura;
Select * from facturi.client;



SELECT x.ID_Factura, f.Serie_Factura, f.Data_factura, x.TotalFactura FROM (SELECT ID_Factura, SUM(Pret*Cantitate) as TotalFactura FROM facturi.detaliu_factura Group by ID_Factura)x  INNER JOIN facturi.factura f ON x.ID_Factura = f.ID_Factura WHERE TotalFactura = (SELECT MAX(x.TotalFactura) FROM (SELECT ID_Factura, SUM(Pret*Cantitate) as TotalFactura FROM facturi.detaliu_factura Group by ID_Factura)x) ;


SELECT x.ID_Produs, Nume_Produs, IncasariProdus FROM ( SELECT ID_Produs, SUM(Pret*Cantitate) as IncasariProdus FROM facturi.detaliu_factura group by ID_Produs)x INNER JOIN facturi.produs p on x.ID_Produs = p.ID_Produs where  IncasariProdus = (SELECT MAX(x.IncasariProdus) FROM (SELECT SUM(Pret*Cantitate) as IncasariProdus FROM facturi.detaliu_factura Group by ID_Produs)x);


SELECT df.ID_Factura, f.ID_Client, c.Nume_Client, SUM(Pret*Cantitate) as TotalFactura FROM facturi.detaliu_factura df INNER JOIN facturi.factura f ON df.ID_Factura = f.ID_Factura INNER JOIN facturi.client c ON f.ID_Client = c.ID_Client GROUP BY df.ID_Factura;


SELECT month(Data_Factura) as Luna, SUM(TotalFactura)/count(x.ID_Factura) as Media from (SELECT ID_Factura, SUM(Pret*Cantitate) as TotalFactura FROM facturi.detaliu_factura Group by ID_Factura)x inner join facturi.factura on x.ID_Factura = factura.ID_Factura group by month(Data_Factura);
