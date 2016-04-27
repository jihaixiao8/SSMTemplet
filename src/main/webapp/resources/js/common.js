/**
 * 公共类
 */
$(function () {

    var _draw = function () {
        var windowHeight = $(window).innerHeight();
        var windowWidth = $(window).width();

        var leftNavHeight = windowHeight - 50;
        var rightWidth = windowWidth - 225-55;
        $(".left_nav").height(leftNavHeight);
        $(".right-content").width(rightWidth);
        $(".right-content").height(leftNavHeight);
    };

    var _dropDownMenu = function (_this) {
        $(_this).attr("data-selected", "true");
        $(_this).parent().removeClass("close-up").addClass("drop-down");
    };

    var _closeUpMenu = function (_this) {
        $(_this).removeAttr("data-selected");
        $(_this).parent().removeClass("drop-down").addClass("close-up");
    };

    var _menu = function () {
        $(".left_nav li").click(function () {
            $(".left_nav li").removeClass('activeStyle');
            $(this).addClass('activeStyle');
        });

        $(".panel-title").click(function () {
            if ($(this).attr("data-selected") == 'true') {
                _closeUpMenu(this);
            } else {
                $(".panel-title").each(function () {
                    if ($(this).attr("data-selected") == 'true') _closeUpMenu(this);
                });
                _dropDownMenu(this);
            }
        });
    };

    var _markedAll = function () {
        $("input[name=markedAll]").click(function () {
            if (this.checked) {
                $("input[name=marked]").each(function () {
                    this.checked = true;
                    $(this).parent().parent('tr').addClass('success');
                });
            } else {
                $("input[name=marked]").each(function () {
                    this.checked = false;
                    $(this).parent().parent('tr').removeClass('success');
                });
            }
        });
        $("input[name=marked]").click(function () {
            if (this.checked) {
                $(this).parent().parent('tr').addClass('success');
            } else {
                $(this).parent().parent('tr').removeClass('success');
            }
        });
    };
    _draw();
    _menu();
    _markedAll();
    $(window).resize(function () {
        _draw();
    });
});


//显示日期
(function () {
    var options = {
        format: 'yyyy-mm-dd',
        minuteStep: 1,
        language: 'fr',
        weekStart: 1,
        todayBtn: 1,
        autoclose: 1,
        todayHighlight: 1,
        startView: 2,
        minView: 2,
        forceParse: 0
    };

    if ($('#startDate').length > 0) {
        $('#startDate')
            .datetimepicker(options)
            .on('changeDate', function (ev) {
                //compareDate();
            });
    }

    if ($('#endDate').length > 0) {
        $('#endDate')
            .datetimepicker(options)
            .on('changeDate', function (ev) {
                //compareDate();
            });
    }

    function compareDate() {
        var endDate = $('#endDate').val();
        var startDate = $('#startDate').val();
        if (startDate > endDate) {
            alert('亲,开始日期要小于结束日期!');
        }
    }
})();

(function () {
    //7天...等按钮
    $('.day-btn').click(function () {
        $(this).addClass('corfff').siblings().removeClass('corfff');
    });

})();

//图标主题
(function () {
    /**
     * Dark theme for Highcharts JS
     * @author Torstein Honsi
     */

// Load the fonts
    Highcharts.createElement('link', {
        href: '//fonts.googleapis.com/css?family=Unica+One',
        rel: 'stylesheet',
        type: 'text/css'
    }, null, document.getElementsByTagName('head')[0]);

    Highcharts.theme = {
        colors: ["#2b908f", "#90ee7e", "#f45b5b", "#7798BF", "#aaeeee", "#ff0066", "#eeaaee",
            "#55BF3B", "#DF5353", "#7798BF", "#aaeeee"],
        chart: {
            /*backgroundColor: {
             linearGradient: { x1: 0, y1: 0, x2: 1, y2: 1 },
             stops: [
             [0, 'rgba(0,0,0,0.2)'],
             [1, 'rgba(0,0,0,0.7)']
             ]
             },*/
            backgroundColor: 'rgba(0,0,0,0.2)',
            style: {
                fontFamily: "'Unica One', sans-serif"
            },
            plotBorderColor: '#606063'
        },
        title: {
            style: {
                color: '#E0E0E3',
                textTransform: 'uppercase',
                fontSize: '20px'
            }
        },
        subtitle: {
            style: {
                color: '#E0E0E3',
                textTransform: 'uppercase'
            }
        },
        xAxis: {
            gridLineColor: '#707073',
            labels: {
                style: {
                    color: '#E0E0E3'
                }
            },
            lineColor: '#707073',
            minorGridLineColor: '#505053',
            tickColor: '#707073',
            title: {
                style: {
                    color: '#A0A0A3'

                }
            }
        },
        yAxis: {
            gridLineColor: '#707073',
            labels: {
                style: {
                    color: '#E0E0E3'
                }
            },
            lineColor: '#707073',
            minorGridLineColor: '#505053',
            tickColor: '#707073',
            tickWidth: 1,
            title: {
                style: {
                    color: '#A0A0A3'
                }
            }
        },
        tooltip: {
            backgroundColor: 'rgba(0, 0, 0, 0.85)',
            style: {
                color: '#F0F0F0'
            }
        },
        plotOptions: {
            series: {
                dataLabels: {
                    color: '#B0B0B3'
                },
                marker: {
                    lineColor: '#333'
                }
            },
            boxplot: {
                fillColor: '#505053'
            },
            candlestick: {
                lineColor: 'white'
            },
            errorbar: {
                color: 'white'
            }
        },
        legend: {
            itemStyle: {
                color: '#E0E0E3'
            },
            itemHoverStyle: {
                color: '#FFF'
            },
            itemHiddenStyle: {
                color: '#606063'
            }
        },
        credits: {
            style: {
                color: '#666'
            }
        },
        labels: {
            style: {
                color: '#707073'
            }
        },

        drilldown: {
            activeAxisLabelStyle: {
                color: '#F0F0F3'
            },
            activeDataLabelStyle: {
                color: '#F0F0F3'
            }
        },

        navigation: {
            buttonOptions: {
                symbolStroke: '#DDDDDD',
                theme: {
                    fill: '#505053'
                }
            }
        },

        // scroll charts
        rangeSelector: {
            buttonTheme: {
                fill: '#505053',
                stroke: '#000000',
                style: {
                    color: '#CCC'
                },
                states: {
                    hover: {
                        fill: '#707073',
                        stroke: '#000000',
                        style: {
                            color: 'white'
                        }
                    },
                    select: {
                        fill: '#000003',
                        stroke: '#000000',
                        style: {
                            color: 'white'
                        }
                    }
                }
            },
            inputBoxBorderColor: '#505053',
            inputStyle: {
                backgroundColor: '#333',
                color: 'silver'
            },
            labelStyle: {
                color: 'silver'
            }
        },

        navigator: {
            handles: {
                backgroundColor: '#666',
                borderColor: '#AAA'
            },
            outlineColor: '#CCC',
            maskFill: 'rgba(255,255,255,0.1)',
            series: {
                color: '#7798BF',
                lineColor: '#A6C7ED'
            },
            xAxis: {
                gridLineColor: '#505053'
            }
        },

        scrollbar: {
            barBackgroundColor: '#808083',
            barBorderColor: '#808083',
            buttonArrowColor: '#CCC',
            buttonBackgroundColor: '#606063',
            buttonBorderColor: '#606063',
            rifleColor: '#FFF',
            trackBackgroundColor: '#404043',
            trackBorderColor: '#404043'
        },

        // special colors for some of the
        legendBackgroundColor: 'rgba(0, 0, 0, 0.5)',
        background2: '#505053',
        dataLabelsColor: '#B0B0B3',
        textColor: '#C0C0C0',
        contrastTextColor: '#F0F0F3',
        maskColor: 'rgba(255,255,255,0.3)'
    };

// Apply the theme
    Highcharts.setOptions(Highcharts.theme);
})();
