(ns dots.typescript.literal-like-node)

(defn text
  ^js [literal-like-node]
  (.-text ^js literal-like-node))

(defn set-text!
  ^js [literal-like-node value]
  (set! (.-text ^js literal-like-node) value))

(defn unterminated?
  ^js [literal-like-node]
  (.-isUnterminated ^js literal-like-node))

(defn set-is-unterminated!
  ^js [literal-like-node value]
  (set! (.-isUnterminated ^js literal-like-node) value))

(defn has-extended-unicode-escape?
  ^js [literal-like-node]
  (.-hasExtendedUnicodeEscape ^js literal-like-node))

(defn set-has-extended-unicode-escape!
  ^js [literal-like-node value]
  (set! (.-hasExtendedUnicodeEscape ^js literal-like-node) value))

(defn kind
  ^js [literal-like-node]
  (.-kind ^js literal-like-node))

(defn flags
  ^js [literal-like-node]
  (.-flags ^js literal-like-node))

(defn parent
  ^js [literal-like-node]
  (.-parent ^js literal-like-node))

(defn source-file
  ^js [literal-like-node]
  (.getSourceFile ^js literal-like-node))

(defn child-count
  (^js [literal-like-node]
   (.getChildCount ^js literal-like-node))
  (^js [literal-like-node source-file]
   (.getChildCount ^js literal-like-node source-file)))

(defn child-at
  (^js [literal-like-node index]
   (.getChildAt ^js literal-like-node index))
  (^js [literal-like-node index source-file]
   (.getChildAt ^js literal-like-node index source-file)))

(defn children
  (^js [literal-like-node]
   (.getChildren ^js literal-like-node))
  (^js [literal-like-node source-file]
   (.getChildren ^js literal-like-node source-file)))

(defn start
  (^js [literal-like-node]
   (.getStart ^js literal-like-node))
  (^js [literal-like-node source-file]
   (.getStart ^js literal-like-node source-file))
  (^js [literal-like-node source-file include-js-doc-comment?]
   (.getStart ^js literal-like-node source-file include-js-doc-comment?)))

(defn full-start
  ^js [literal-like-node]
  (.getFullStart ^js literal-like-node))

(defn get-end
  ^js [literal-like-node]
  (.getEnd ^js literal-like-node))

(defn width
  (^js [literal-like-node]
   (.getWidth ^js literal-like-node))
  (^js [literal-like-node source-file]
   (.getWidth ^js literal-like-node source-file)))

(defn full-width
  ^js [literal-like-node]
  (.getFullWidth ^js literal-like-node))

(defn leading-trivia-width
  (^js [literal-like-node]
   (.getLeadingTriviaWidth ^js literal-like-node))
  (^js [literal-like-node source-file]
   (.getLeadingTriviaWidth ^js literal-like-node source-file)))

(defn full-text
  (^js [literal-like-node]
   (.getFullText ^js literal-like-node))
  (^js [literal-like-node source-file]
   (.getFullText ^js literal-like-node source-file)))

(defn get-text
  (^js [literal-like-node]
   (.getText ^js literal-like-node))
  (^js [literal-like-node source-file]
   (.getText ^js literal-like-node source-file)))

(defn first-token
  (^js [literal-like-node]
   (.getFirstToken ^js literal-like-node))
  (^js [literal-like-node source-file]
   (.getFirstToken ^js literal-like-node source-file)))

(defn last-token
  (^js [literal-like-node]
   (.getLastToken ^js literal-like-node))
  (^js [literal-like-node source-file]
   (.getLastToken ^js literal-like-node source-file)))

(defn for-each-child
  (^js [literal-like-node cb-node]
   (.forEachChild ^js literal-like-node cb-node))
  (^js [literal-like-node cb-node cb-node-array]
   (.forEachChild ^js literal-like-node cb-node cb-node-array)))

(defn pos
  ^js [literal-like-node]
  (.-pos ^js literal-like-node))

(defn end
  ^js [literal-like-node]
  (.-end ^js literal-like-node))
