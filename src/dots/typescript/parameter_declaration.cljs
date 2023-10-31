(ns dots.typescript.parameter-declaration
  (:refer-clojure :exclude [name type]))

(defn kind
  ^js [parameter-declaration]
  (.-kind ^js parameter-declaration))

(defn parent
  ^js [parameter-declaration]
  (.-parent ^js parameter-declaration))

(defn modifiers
  ^js [parameter-declaration]
  (.-modifiers ^js parameter-declaration))

(defn dot-dot-dot-token
  ^js [parameter-declaration]
  (.-dotDotDotToken ^js parameter-declaration))

(defn name
  ^js [parameter-declaration]
  (.-name ^js parameter-declaration))

(defn question-token
  ^js [parameter-declaration]
  (.-questionToken ^js parameter-declaration))

(defn type
  ^js [parameter-declaration]
  (.-type ^js parameter-declaration))

(defn initializer
  ^js [parameter-declaration]
  (.-initializer ^js parameter-declaration))

(defn flags
  ^js [parameter-declaration]
  (.-flags ^js parameter-declaration))

(defn source-file
  ^js [parameter-declaration]
  (.getSourceFile ^js parameter-declaration))

(defn child-count
  (^js [parameter-declaration]
   (.getChildCount ^js parameter-declaration))
  (^js [parameter-declaration source-file]
   (.getChildCount ^js parameter-declaration source-file)))

(defn child-at
  (^js [parameter-declaration index]
   (.getChildAt ^js parameter-declaration index))
  (^js [parameter-declaration index source-file]
   (.getChildAt ^js parameter-declaration index source-file)))

(defn children
  (^js [parameter-declaration]
   (.getChildren ^js parameter-declaration))
  (^js [parameter-declaration source-file]
   (.getChildren ^js parameter-declaration source-file)))

(defn start
  (^js [parameter-declaration]
   (.getStart ^js parameter-declaration))
  (^js [parameter-declaration source-file]
   (.getStart ^js parameter-declaration source-file))
  (^js [parameter-declaration source-file include-js-doc-comment?]
   (.getStart ^js parameter-declaration source-file include-js-doc-comment?)))

(defn full-start
  ^js [parameter-declaration]
  (.getFullStart ^js parameter-declaration))

(defn get-end
  ^js [parameter-declaration]
  (.getEnd ^js parameter-declaration))

(defn width
  (^js [parameter-declaration]
   (.getWidth ^js parameter-declaration))
  (^js [parameter-declaration source-file]
   (.getWidth ^js parameter-declaration source-file)))

(defn full-width
  ^js [parameter-declaration]
  (.getFullWidth ^js parameter-declaration))

(defn leading-trivia-width
  (^js [parameter-declaration]
   (.getLeadingTriviaWidth ^js parameter-declaration))
  (^js [parameter-declaration source-file]
   (.getLeadingTriviaWidth ^js parameter-declaration source-file)))

(defn full-text
  (^js [parameter-declaration]
   (.getFullText ^js parameter-declaration))
  (^js [parameter-declaration source-file]
   (.getFullText ^js parameter-declaration source-file)))

(defn text
  (^js [parameter-declaration]
   (.getText ^js parameter-declaration))
  (^js [parameter-declaration source-file]
   (.getText ^js parameter-declaration source-file)))

(defn first-token
  (^js [parameter-declaration]
   (.getFirstToken ^js parameter-declaration))
  (^js [parameter-declaration source-file]
   (.getFirstToken ^js parameter-declaration source-file)))

(defn last-token
  (^js [parameter-declaration]
   (.getLastToken ^js parameter-declaration))
  (^js [parameter-declaration source-file]
   (.getLastToken ^js parameter-declaration source-file)))

(defn for-each-child
  (^js [parameter-declaration cb-node]
   (.forEachChild ^js parameter-declaration cb-node))
  (^js [parameter-declaration cb-node cb-node-array]
   (.forEachChild ^js parameter-declaration cb-node cb-node-array)))

(defn decorators
  ^js [parameter-declaration]
  (.-decorators ^js parameter-declaration))

(defn pos
  ^js [parameter-declaration]
  (.-pos ^js parameter-declaration))

(defn end
  ^js [parameter-declaration]
  (.-end ^js parameter-declaration))
