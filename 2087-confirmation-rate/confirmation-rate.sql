# Write your MySQL query statement below

SELECT su.user_id , IFNULL(ROUND(SUM(c.action = 'confirmed') / COUNT(c.action), 2), 0) AS confirmation_rate FROM Signups su
LEFT JOIN Confirmations c ON
su.user_id = c.user_id
GROUP BY su.user_id;