(ns dots.typescript.signature-declaration-base
  (:refer-clojure :exclude [name type]))

(defn kind
  ^js [signature-declaration-base]
  (.-kind ^js signature-declaration-base))

(defn name
  ^js [signature-declaration-base]
  (.-name ^js signature-declaration-base))

(defn type-parameters
  ^js [signature-declaration-base]
  (.-typeParameters ^js signature-declaration-base))

(defn parameters
  ^js [signature-declaration-base]
  (.-parameters ^js signature-declaration-base))

(defn type
  ^js [signature-declaration-base]
  (.-type ^js signature-declaration-base))

(defn flags
  ^js [signature-declaration-base]
  (.-flags ^js signature-declaration-base))

(defn parent
  ^js [signature-declaration-base]
  (.-parent ^js signature-declaration-base))

(defn source-file
  ^js [signature-declaration-base]
  (.getSourceFile ^js signature-declaration-base))

(defn child-count
  (^js [signature-declaration-base]
   (.getChildCount ^js signature-declaration-base))
  (^js [signature-declaration-base source-file]
   (.getChildCount ^js signature-declaration-base source-file)))

(defn child-at
  (^js [signature-declaration-base index]
   (.getChildAt ^js signature-declaration-base index))
  (^js [signature-declaration-base index source-file]
   (.getChildAt ^js signature-declaration-base index source-file)))

(defn children
  (^js [signature-declaration-base]
   (.getChildren ^js signature-declaration-base))
  (^js [signature-declaration-base source-file]
   (.getChildren ^js signature-declaration-base source-file)))

(defn start
  (^js [signature-declaration-base]
   (.getStart ^js signature-declaration-base))
  (^js [signature-declaration-base source-file]
   (.getStart ^js signature-declaration-base source-file))
  (^js [signature-declaration-base source-file include-js-doc-comment?]
   (.getStart ^js signature-declaration-base source-file include-js-doc-comment?)))

(defn full-start
  ^js [signature-declaration-base]
  (.getFullStart ^js signature-declaration-base))

(defn get-end
  ^js [signature-declaration-base]
  (.getEnd ^js signature-declaration-base))

(defn width
  (^js [signature-declaration-base]
   (.getWidth ^js signature-declaration-base))
  (^js [signature-declaration-base source-file]
   (.getWidth ^js signature-declaration-base source-file)))

(defn full-width
  ^js [signature-declaration-base]
  (.getFullWidth ^js signature-declaration-base))

(defn leading-trivia-width
  (^js [signature-declaration-base]
   (.getLeadingTriviaWidth ^js signature-declaration-base))
  (^js [signature-declaration-base source-file]
   (.getLeadingTriviaWidth ^js signature-declaration-base source-file)))

(defn full-text
  (^js [signature-declaration-base]
   (.getFullText ^js signature-declaration-base))
  (^js [signature-declaration-base source-file]
   (.getFullText ^js signature-declaration-base source-file)))

(defn text
  (^js [signature-declaration-base]
   (.getText ^js signature-declaration-base))
  (^js [signature-declaration-base source-file]
   (.getText ^js signature-declaration-base source-file)))

(defn first-token
  (^js [signature-declaration-base]
   (.getFirstToken ^js signature-declaration-base))
  (^js [signature-declaration-base source-file]
   (.getFirstToken ^js signature-declaration-base source-file)))

(defn last-token
  (^js [signature-declaration-base]
   (.getLastToken ^js signature-declaration-base))
  (^js [signature-declaration-base source-file]
   (.getLastToken ^js signature-declaration-base source-file)))

(defn for-each-child
  (^js [signature-declaration-base cb-node]
   (.forEachChild ^js signature-declaration-base cb-node))
  (^js [signature-declaration-base cb-node cb-node-array]
   (.forEachChild ^js signature-declaration-base cb-node cb-node-array)))

(defn pos
  ^js [signature-declaration-base]
  (.-pos ^js signature-declaration-base))

(defn end
  ^js [signature-declaration-base]
  (.-end ^js signature-declaration-base))
