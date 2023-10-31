(ns dots.typescript.printer)

(defn print-node
  "Print a node and its subtree as-is, without any emit transformations."
  ^js [printer hint node source-file]
  (.printNode ^js printer hint node source-file))

(defn print-list
  "Prints a list of nodes using the given format flags"
  ^js [printer format list source-file]
  (.printList ^js printer format list source-file))

(defn print-file
  "Prints a source file as-is, without any emit transformations."
  ^js [printer source-file]
  (.printFile ^js printer source-file))

(defn print-bundle
  "Prints a bundle of source files as-is, without any emit transformations."
  ^js [printer bundle]
  (.printBundle ^js printer bundle))
