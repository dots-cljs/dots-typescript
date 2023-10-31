(ns dots.typescript.outlining-span)

(defn text-span
  "The span of the document to actually collapse."
  ^js [outlining-span]
  (.-textSpan ^js outlining-span))

(defn set-text-span!
  "The span of the document to actually collapse."
  ^js [outlining-span value]
  (set! (.-textSpan ^js outlining-span) value))

(defn hint-span
  "The span of the document to display when the user hovers over the collapsed span."
  ^js [outlining-span]
  (.-hintSpan ^js outlining-span))

(defn set-hint-span!
  "The span of the document to display when the user hovers over the collapsed span."
  ^js [outlining-span value]
  (set! (.-hintSpan ^js outlining-span) value))

(defn banner-text
  "The text to display in the editor for the collapsed region."
  ^js [outlining-span]
  (.-bannerText ^js outlining-span))

(defn set-banner-text!
  "The text to display in the editor for the collapsed region."
  ^js [outlining-span value]
  (set! (.-bannerText ^js outlining-span) value))

(defn auto-collapse?
  "Whether or not this region should be automatically collapsed when
   the 'Collapse to Definitions' command is invoked."
  ^js [outlining-span]
  (.-autoCollapse ^js outlining-span))

(defn set-auto-collapse!
  "Whether or not this region should be automatically collapsed when
   the 'Collapse to Definitions' command is invoked."
  ^js [outlining-span value]
  (set! (.-autoCollapse ^js outlining-span) value))

(defn kind
  "Classification of the contents of the span"
  ^js [outlining-span]
  (.-kind ^js outlining-span))

(defn set-kind!
  "Classification of the contents of the span"
  ^js [outlining-span value]
  (set! (.-kind ^js outlining-span) value))
