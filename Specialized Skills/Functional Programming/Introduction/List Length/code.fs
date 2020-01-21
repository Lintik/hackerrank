open System

let i = Console.In.ReadToEnd().Split([|Environment.NewLine|], StringSplitOptions.RemoveEmptyEntries) |> Array.map (fun t-> int t) |> List.ofArray

printfn "%d" i.Length