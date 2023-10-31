(ns dots.typescript.index-signature-declaration
  (:refer-clojure :exclude [name type]))

(defn kind
  ^js [index-signature-declaration]
  (.-kind ^js index-signature-declaration))

(defn parent
  ^js [index-signature-declaration]
  (.-parent ^js index-signature-declaration))

(defn modifiers
  ^js [index-signature-declaration]
  (.-modifiers ^js index-signature-declaration))

(defn type
  ^js [index-signature-declaration]
  (.-type ^js index-signature-declaration))

(defn name
  ^js [index-signature-declaration]
  (.-name ^js index-signature-declaration))

(defn type-parameters
  ^js [index-signature-declaration]
  (.-typeParameters ^js index-signature-declaration))

(defn parameters
  ^js [index-signature-declaration]
  (.-parameters ^js index-signature-declaration))

(defn flags
  ^js [index-signature-declaration]
  (.-flags ^js index-signature-declaration))

(defn source-file
  ^js [index-signature-declaration]
  (.getSourceFile ^js index-signature-declaration))

(defn child-count
  (^js [index-signature-declaration]
   (.getChildCount ^js index-signature-declaration))
  (^js [index-signature-declaration source-file]
   (.getChildCount ^js index-signature-declaration source-file)))

(defn child-at
  (^js [index-signature-declaration index]
   (.getChildAt ^js index-signature-declaration index))
  (^js [index-signature-declaration index source-file]
   (.getChildAt ^js index-signature-declaration index source-file)))

(defn children
  (^js [index-signature-declaration]
   (.getChildren ^js index-signature-declaration))
  (^js [index-signature-declaration source-file]
   (.getChildren ^js index-signature-declaration source-file)))

(defn start
  (^js [index-signature-declaration]
   (.getStart ^js index-signature-declaration))
  (^js [index-signature-declaration source-file]
   (.getStart ^js index-signature-declaration source-file))
  (^js [index-signature-declaration source-file include-js-doc-comment?]
   (.getStart ^js index-signature-declaration source-file include-js-doc-comment?)))

(defn full-start
  ^js [index-signature-declaration]
  (.getFullStart ^js index-signature-declaration))

(defn get-end
  ^js [index-signature-declaration]
  (.getEnd ^js index-signature-declaration))

(defn width
  (^js [index-signature-declaration]
   (.getWidth ^js index-signature-declaration))
  (^js [index-signature-declaration source-file]
   (.getWidth ^js index-signature-declaration source-file)))

(defn full-width
  ^js [index-signature-declaration]
  (.getFullWidth ^js index-signature-declaration))

(defn leading-trivia-width
  (^js [index-signature-declaration]
   (.getLeadingTriviaWidth ^js index-signature-declaration))
  (^js [index-signature-declaration source-file]
   (.getLeadingTriviaWidth ^js index-signature-declaration source-file)))

(defn full-text
  (^js [index-signature-declaration]
   (.getFullText ^js index-signature-declaration))
  (^js [index-signature-declaration source-file]
   (.getFullText ^js index-signature-declaration source-file)))

(defn text
  (^js [index-signature-declaration]
   (.getText ^js index-signature-declaration))
  (^js [index-signature-declaration source-file]
   (.getText ^js index-signature-declaration source-file)))

(defn first-token
  (^js [index-signature-declaration]
   (.getFirstToken ^js index-signature-declaration))
  (^js [index-signature-declaration source-file]
   (.getFirstToken ^js index-signature-declaration source-file)))

(defn last-token
  (^js [index-signature-declaration]
   (.getLastToken ^js index-signature-declaration))
  (^js [index-signature-declaration source-file]
   (.getLastToken ^js index-signature-declaration source-file)))

(defn for-each-child
  (^js [index-signature-declaration cb-node]
   (.forEachChild ^js index-signature-declaration cb-node))
  (^js [index-signature-declaration cb-node cb-node-array]
   (.forEachChild ^js index-signature-declaration cb-node cb-node-array)))

(defn pos
  ^js [index-signature-declaration]
  (.-pos ^js index-signature-declaration))

(defn end
  ^js [index-signature-declaration]
  (.-end ^js index-signature-declaration))

(defn question-token
  ^js [index-signature-declaration]
  (.-questionToken ^js index-signature-declaration))
