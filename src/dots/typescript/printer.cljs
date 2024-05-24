(ns dots.typescript.printer)

(defn print-node
  "Print a node and its subtree as-is, without any emit transformations.
   
   **Parameters:**
   - `hint`: `EmitHint` - A value indicating the purpose of a node. This is primarily used to
   distinguish between an `Identifier` used in an expression position, versus an
   `Identifier` used as an `IdentifierName` as part of a declaration. For most nodes you
   should just pass `Unspecified`.
   - `node`: `Node` - The node to print. The node and its subtree are printed as-is, without any
   emit transformations.
   - `source-file`: `SourceFile` - A source file that provides context for the node. The source text of
   the file is used to emit the original source content for literals and identifiers, while
   the identifiers of the source file are used when generating unique names to avoid
   collisions.
   
   **Returns:** `string`"
  ^js [printer hint node source-file]
  (.printNode ^js printer hint node source-file))

(defn print-list
  "Prints a list of nodes using the given format flags
   
   **Parameters:**
   - `format`: `ListFormat`
   - `list`: `NodeArray<T>`
   - `source-file`: `SourceFile`
   
   **Returns:** `string`"
  ^js [printer format list source-file]
  (.printList ^js printer format list source-file))

(defn print-file
  "Prints a source file as-is, without any emit transformations.
   
   **Parameters:**
   - `source-file`: `SourceFile`
   
   **Returns:** `string`"
  ^js [printer source-file]
  (.printFile ^js printer source-file))

(defn print-bundle
  "Prints a bundle of source files as-is, without any emit transformations.
   
   **Parameters:**
   - `bundle`: `Bundle`
   
   **Returns:** `string`"
  ^js [printer bundle]
  (.printBundle ^js printer bundle))
