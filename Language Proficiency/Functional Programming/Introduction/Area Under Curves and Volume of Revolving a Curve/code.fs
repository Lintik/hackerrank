open System

let integral f left right =
    let dx = 0.001
    Seq.sum [ for x in left .. dx .. right -> (f x) * dx ]

let polynomialExpr aSeq bSeq x =
    Seq.zip aSeq bSeq
    |> Seq.map (fun (a, b) -> a * pown x b)
    |> Seq.sum

let rotate f x =
    let y = f x
    y * y * Math.PI

let area aSeq bSeq left right =
    integral (polynomialExpr aSeq bSeq) left right

let volume aSeq bSeq left right =
    integral (rotate <| polynomialExpr aSeq bSeq) left right

[<EntryPoint>]
let main argv = 
    let x = 
        stdin.ReadLine().Split(' ')
        |> Array.map float
        |> Array.toList

    let p = 
        stdin.ReadLine().Split(' ')
        |> Array.map int
        |> Array.toList
    
    let ab =
        stdin.ReadLine().Split(' ')
        |> Array.map float
    let a, b = ab.[0], ab.[1]

    printfn "%.1f" <| area x p a b
    printfn "%.1f" <| volume x p a b

    0
