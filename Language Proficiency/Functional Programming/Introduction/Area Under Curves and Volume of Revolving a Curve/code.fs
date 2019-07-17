open System

let dx = 0.001

let integral f l u =
    [l..dx..u] |> (List.map (fun x -> (f x) * dx)) |> List.sum

let poly l1 l2 x =
    List.zip l1 l2
    |> List.map (fun (a, b) -> a * (x ** b))
    |> List.sum

let rotate f x =
    let y = f x
    y * y * Math.PI

let area l1 l2 l u =
    integral (poly l1 l2) l u

let volume l1 l2 l u =
    integral (poly l1 l2 |> rotate) l u