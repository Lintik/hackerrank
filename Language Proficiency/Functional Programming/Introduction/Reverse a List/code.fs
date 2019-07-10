open System

let x = Console.In.ReadToEnd().Split([|Environment.NewLine|], StringSplitOptions.RemoveEmptyEntries) |> Array.map (fun t-> int t) |> List.ofArray
let y = List.rev x

y |> List.iter (printfn "%d")